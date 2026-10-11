.class public final synthetic Lax/N1/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/l;


# instance fields
.field public final synthetic a:Lax/N1/w;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lax/N1/w;JI)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/N1/v;->a:Lax/N1/w;

    iput-wide p2, p0, Lax/N1/v;->b:J

    iput p4, p0, Lax/N1/v;->c:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/N1/v;->a:Lax/N1/w;

    iget-wide v1, p0, Lax/N1/v;->b:J

    iget v3, p0, Lax/N1/v;->c:I

    check-cast p1, Lax/N1/e;

    invoke-static {v0, v1, v2, v3, p1}, Lax/N1/w;->h(Lax/N1/w;JILax/N1/e;)V

    return-void
.end method
