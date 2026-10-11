.class public final synthetic Lax/Z0/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;IJ)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/Y;->a:Lax/Z0/c$a;

    iput p2, p0, Lax/Z0/Y;->b:I

    iput-wide p3, p0, Lax/Z0/Y;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/Z0/Y;->a:Lax/Z0/c$a;

    iget v1, p0, Lax/Z0/Y;->b:I

    iget-wide v2, p0, Lax/Z0/Y;->c:J

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, v2, v3, p1}, Lax/Z0/u0;->y0(Lax/Z0/c$a;IJLax/Z0/c;)V

    return-void
.end method
