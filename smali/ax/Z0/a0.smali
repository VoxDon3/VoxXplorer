.class public final synthetic Lax/Z0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;JI)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/a0;->a:Lax/Z0/c$a;

    iput-wide p2, p0, Lax/Z0/a0;->b:J

    iput p4, p0, Lax/Z0/a0;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/Z0/a0;->a:Lax/Z0/c$a;

    iget-wide v1, p0, Lax/Z0/a0;->b:J

    iget v3, p0, Lax/Z0/a0;->c:I

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, v2, v3, p1}, Lax/Z0/u0;->r1(Lax/Z0/c$a;JILax/Z0/c;)V

    return-void
.end method
