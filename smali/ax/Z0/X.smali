.class public final synthetic Lax/Z0/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;J)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/X;->a:Lax/Z0/c$a;

    iput-wide p2, p0, Lax/Z0/X;->b:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Z0/X;->a:Lax/Z0/c$a;

    iget-wide v1, p0, Lax/Z0/X;->b:J

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, v2, p1}, Lax/Z0/u0;->Q0(Lax/Z0/c$a;JLax/Z0/c;)V

    return-void
.end method
